package com.zhj.desigin.StructureModel.proxy;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class ProxySubject extends Subject{
    Subject realSubject = null;

    public ProxySubject(Subject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        preRequest();           //真实角色前
        realSubject.request();
        postRequest();          //真实角色后
    }


    private void preRequest(){
    }

    private void postRequest(){
    }

}