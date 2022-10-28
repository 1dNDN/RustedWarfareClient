package com.corrodinggames.rts.gameFramework.p039g;

import com.corrodinggames.rts.gameFramework.AbstractC0916l;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Vector;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.g.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/b.class */
public class C0821b extends ResourceBundle {

    /* renamed from: a */
    ResourceBundle f5404a;

    /* renamed from: b */
    ResourceBundle f5405b;

    public C0821b(ResourceBundle resourceBundle, ResourceBundle resourceBundle2) {
        this.f5404a = resourceBundle;
        this.f5405b = resourceBundle2;
    }

    @Override // java.util.ResourceBundle
    public Enumeration getKeys() {
        AbstractC0916l.m963e("MultipleResourceBundle: Slow get keys");
        Vector vector = new Vector();
        vector.addAll(Collections.list(this.f5404a.getKeys()));
        if (this.f5405b != null) {
            Iterator it = Collections.list(this.f5405b.getKeys()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!vector.contains(str)) {
                    vector.add(str);
                }
            }
        }
        return vector.elements();
    }

    @Override // java.util.ResourceBundle
    protected Object handleGetObject(String str) {
        Object obj;
        try {
            obj = this.f5404a.getObject(str);
        } catch (MissingResourceException e) {
            obj = null;
        }
        if (obj == null && this.f5405b != null) {
            try {
                obj = this.f5405b.getObject(str);
            } catch (MissingResourceException e2) {
                obj = null;
            }
        }
        return obj;
    }
}
