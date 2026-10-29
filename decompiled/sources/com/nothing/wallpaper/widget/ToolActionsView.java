package com.nothing.wallpaper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.widget.ToolActionsView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1439m;
import p149o8.b;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"WrongViewCast"})
public final class ToolActionsView extends ConstraintLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f19187q;

    public enum a {
        LEFT,
        MIDDLE,
        RIGHT;


        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ p149o8.a f19192u = b.a(d());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToolActionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
    }

    public final void c(a... actions) {
        n.h(actions, "actions");
        for (a aVar : actions) {
            ImageButton imageButton = (ImageButton) this.f19187q.get(aVar);
            if (imageButton != null) {
                imageButton.setEnabled(false);
            }
        }
    }

    public final void d(a... actions) {
        n.h(actions, "actions");
        for (a aVar : actions) {
            ImageButton imageButton = (ImageButton) this.f19187q.get(aVar);
            if (imageButton != null) {
                imageButton.setEnabled(true);
            }
        }
    }

    public final void e(a... actions) {
        n.h(actions, "actions");
        for (a aVar : actions) {
            ImageButton imageButton = (ImageButton) this.f19187q.get(aVar);
            if (imageButton != null) {
                imageButton.setVisibility(4);
            }
        }
    }

    public final void f(a actionButton, final View.OnClickListener actionClickListener) {
        n.h(actionButton, "actionButton");
        n.h(actionClickListener, "actionClickListener");
        ImageButton imageButton = (ImageButton) this.f19187q.get(actionButton);
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: T7.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ToolActionsView.g(actionClickListener, view);
                }
            });
        }
    }

    public final void h(a... actions) {
        n.h(actions, "actions");
        for (a aVar : actions) {
            ImageButton imageButton = (ImageButton) this.f19187q.get(aVar);
            if (imageButton != null) {
                imageButton.setVisibility(0);
            }
        }
    }

    public final void i(a... actions) {
        n.h(actions, "actions");
        for (a aVar : this.f19187q.keySet()) {
            if (AbstractC1439m.C(actions, aVar)) {
                h(aVar);
            } else {
                e(aVar);
            }
        }
    }

    public /* synthetic */ ToolActionsView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolActionsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f19187q = linkedHashMap;
        LayoutInflater.from(context).inflate(R.layout.nt_tool_actions, (ViewGroup) this, true);
        linkedHashMap.put(a.LEFT, requireViewById(R.id.action_left));
        linkedHashMap.put(a.MIDDLE, requireViewById(R.id.action_middle));
        linkedHashMap.put(a.RIGHT, requireViewById(R.id.action_right));
    }
}
