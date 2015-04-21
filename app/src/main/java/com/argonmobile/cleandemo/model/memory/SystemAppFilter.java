package com.argonmobile.cleandemo.model.memory;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sean on 4/21/15.
 */
public class SystemAppFilter implements IAppFilter {
    public final static SystemAppFilter defaultFilter = new SystemAppFilter();
    static {
        Set<String> default_ignores = new HashSet<String>();
        default_ignores.add("system");
        default_ignores.add("com.android.phone");
        default_ignores.add("com.android.email");
        default_ignores.add("com.android.systemui");
        default_ignores.add("android.process.media");
        default_ignores.add("com.oppo.launcher");
        default_ignores.add("android.process.acore");
        default_ignores.add("com.sohu.inputmethod.sogouoem");
        default_ignores.add("com.android.smspush");
        default_ignores.add("com.android.nfc");
        default_ignores.add("com.oppo.oppogestureservice");
        default_ignores.add("com.oppo.vwu");
        default_ignores.add("com.oppo.maxxaudio");
        default_ignores.add("com.coloros.appmanager");
        defaultFilter.setIgnorePackages(default_ignores);
    }
    private Set<String> ignore_pkgs = new HashSet<String>();
    public void setIgnorePackages(Collection<String> collection) {
        ignore_pkgs.clear();
        ignore_pkgs.addAll(collection);
    }

    @Override
    public boolean isFilter(String name) {
        return ignore_pkgs.contains(name);
    }
}
