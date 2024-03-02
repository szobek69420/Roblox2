package main.java.org.game.updatable;

public abstract class Updatable {

    private String tag="";
    private boolean isInitialized=false;

    /** az elso update hivas elott hivodik.*/
    public abstract void onStart();
    public abstract void onUpdate();
    public abstract void onDestroy();

    public final String getTag(){return tag;}
    public final void setTag(String tag){this.tag=tag;}
    public final boolean isInitialized(){return this.isInitialized;}
    public final void setInitializedTrue(){this.isInitialized=true;}
}
