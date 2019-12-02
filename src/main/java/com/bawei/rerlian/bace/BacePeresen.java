package com.bawei.rerlian.bace;

import com.bawei.rerlian.contates.IContates;

import java.lang.ref.WeakReference;

/**
 * @auther:董青勇
 * @Date: 2019/12/2
 * @Time: 8:46
 * @Description:
 */
public abstract class BacePeresen<V extends IContates.Iview> implements IContates.Ipresenter {
    public BacePeresen() {
        initModel();
    }

    protected abstract void initModel();
    public WeakReference<V> weakReference;
    //绑定
    protected  void attch(V v){
         weakReference=new WeakReference<>(v);
    }
    //解绑
    protected  void deAttch(){
        if (weakReference != null) {
            weakReference.clear();;
            weakReference=null;
        }
    }
    protected  V  getView(){
        return  weakReference.get();
    }


}
