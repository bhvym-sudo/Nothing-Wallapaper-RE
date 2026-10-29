package com.android.wallpaper;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.d;
import androidx.databinding.e;
import androidx.databinding.g;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.List;
import p044e3.A0;
import p044e3.B;
import p044e3.C0;
import p044e3.C1313a0;
import p044e3.C1314b;
import p044e3.C1317c0;
import p044e3.C1318d;
import p044e3.C1321e0;
import p044e3.C1322f;
import p044e3.C1325g0;
import p044e3.C1326h;
import p044e3.C1329i0;
import p044e3.C1330j;
import p044e3.C1332l;
import p044e3.C1334n;
import p044e3.C1336p;
import p044e3.C1339t;
import p044e3.C1341v;
import p044e3.C1343x;
import p044e3.C1345z;
import p044e3.D;
import p044e3.E0;
import p044e3.F;
import p044e3.G0;
import p044e3.H;
import p044e3.I0;
import p044e3.J;
import p044e3.L;
import p044e3.N;
import p044e3.P;
import p044e3.S;
import p044e3.U;
import p044e3.W;
import p044e3.Y;
import p044e3.k0;
import p044e3.m0;
import p044e3.o0;
import p044e3.q0;
import p044e3.r;
import p044e3.s0;
import p044e3.u0;
import p044e3.w0;
import p044e3.y0;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f15836a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(43);
        f15836a = sparseIntArray;
        sparseIntArray.put(R.layout.clock_face_item, 1);
        sparseIntArray.put(R.layout.clock_host_edit_preview, 2);
        sparseIntArray.put(R.layout.clock_host_view_layout, 3);
        sparseIntArray.put(R.layout.clock_picker_page, 4);
        sparseIntArray.put(R.layout.clock_snapshot_item_view, 5);
        sparseIntArray.put(R.layout.clock_snapshot_list_view, 6);
        sparseIntArray.put(R.layout.dialog_creative_policy, 7);
        sparseIntArray.put(R.layout.fragment_ai_wallpaper_entrace, 8);
        sparseIntArray.put(R.layout.fragment_creative_result, 9);
        sparseIntArray.put(R.layout.fragment_creative_selector, 10);
        sparseIntArray.put(R.layout.fragment_lock_screen_main, 11);
        sparseIntArray.put(R.layout.fragment_screen_preview, 12);
        sparseIntArray.put(R.layout.item_creative_history_limitation, 13);
        sparseIntArray.put(R.layout.item_creative_prompt_image, 14);
        sparseIntArray.put(R.layout.item_creative_result, 15);
        sparseIntArray.put(R.layout.layout_creative_no_network, 16);
        sparseIntArray.put(R.layout.layout_unlock_bauhaus, 17);
        sparseIntArray.put(R.layout.lock_screen_preview_layout, 18);
        sparseIntArray.put(R.layout.my_photo_categrory_view, 19);
        sparseIntArray.put(R.layout.nt_category_item, 20);
        sparseIntArray.put(R.layout.nt_category_item_empty, 21);
        sparseIntArray.put(R.layout.nt_category_item_foot, 22);
        sparseIntArray.put(R.layout.nt_category_place_holder_item, 23);
        sparseIntArray.put(R.layout.nt_category_view, 24);
        sparseIntArray.put(R.layout.nt_creative_category_item, 25);
        sparseIntArray.put(R.layout.nt_dialog_customization_reset, 26);
        sparseIntArray.put(R.layout.nt_effect_actions_layout, 27);
        sparseIntArray.put(R.layout.nt_effect_button, 28);
        sparseIntArray.put(R.layout.nt_fragment_category_selector, 29);
        sparseIntArray.put(R.layout.nt_photo_view, 30);
        sparseIntArray.put(R.layout.nt_preview_fragment, 31);
        sparseIntArray.put(R.layout.preview_color_on_home_screen, 32);
        sparseIntArray.put(R.layout.preview_color_on_picture_screen, 33);
        sparseIntArray.put(R.layout.shortcut_picker_item, 34);
        sparseIntArray.put(R.layout.shortcut_picker_page, 35);
        sparseIntArray.put(R.layout.shortcut_preview, 36);
        sparseIntArray.put(R.layout.transition_image_view, 37);
        sparseIntArray.put(R.layout.widget_delete_drop_view, 38);
        sparseIntArray.put(R.layout.widget_list_head, 39);
        sparseIntArray.put(R.layout.widget_list_item, 40);
        sparseIntArray.put(R.layout.widget_picker_details, 41);
        sparseIntArray.put(R.layout.widget_picker_group_page, 42);
        sparseIntArray.put(R.layout.widget_preview_item, 43);
    }

    @Override // androidx.databinding.d
    public List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.d
    public g b(e eVar, View view, int i10) {
        int i11 = f15836a.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        switch (i11) {
            case 1:
                if ("layout/clock_face_item_0".equals(tag)) {
                    return new C1314b(eVar, view);
                }
                throw new IllegalArgumentException("The tag for clock_face_item is invalid. Received: " + tag);
            case 2:
                if ("layout/clock_host_edit_preview_0".equals(tag)) {
                    return new C1318d(eVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for clock_host_edit_preview is invalid. Received: " + tag);
            case 3:
                if ("layout/clock_host_view_layout_0".equals(tag)) {
                    return new C1322f(eVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for clock_host_view_layout is invalid. Received: " + tag);
            case 4:
                if ("layout/clock_picker_page_0".equals(tag)) {
                    return new C1326h(eVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for clock_picker_page is invalid. Received: " + tag);
            case 5:
                if ("layout/clock_snapshot_item_view_0".equals(tag)) {
                    return new C1330j(eVar, view);
                }
                throw new IllegalArgumentException("The tag for clock_snapshot_item_view is invalid. Received: " + tag);
            case 6:
                if ("layout/clock_snapshot_list_view_0".equals(tag)) {
                    return new C1332l(eVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for clock_snapshot_list_view is invalid. Received: " + tag);
            case 7:
                if ("layout/dialog_creative_policy_0".equals(tag)) {
                    return new C1334n(eVar, view);
                }
                throw new IllegalArgumentException("The tag for dialog_creative_policy is invalid. Received: " + tag);
            case 8:
                if ("layout/fragment_ai_wallpaper_entrace_0".equals(tag)) {
                    return new C1336p(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_ai_wallpaper_entrace is invalid. Received: " + tag);
            case 9:
                if ("layout/fragment_creative_result_0".equals(tag)) {
                    return new r(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_creative_result is invalid. Received: " + tag);
            case 10:
                if ("layout/fragment_creative_selector_0".equals(tag)) {
                    return new C1339t(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_creative_selector is invalid. Received: " + tag);
            case 11:
                if ("layout/fragment_lock_screen_main_0".equals(tag)) {
                    return new C1341v(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_lock_screen_main is invalid. Received: " + tag);
            case 12:
                if ("layout/fragment_screen_preview_0".equals(tag)) {
                    return new C1343x(eVar, view);
                }
                throw new IllegalArgumentException("The tag for fragment_screen_preview is invalid. Received: " + tag);
            case 13:
                if ("layout/item_creative_history_limitation_0".equals(tag)) {
                    return new C1345z(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_creative_history_limitation is invalid. Received: " + tag);
            case 14:
                if ("layout/item_creative_prompt_image_0".equals(tag)) {
                    return new B(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_creative_prompt_image is invalid. Received: " + tag);
            case 15:
                if ("layout/item_creative_result_0".equals(tag)) {
                    return new D(eVar, view);
                }
                throw new IllegalArgumentException("The tag for item_creative_result is invalid. Received: " + tag);
            case 16:
                if ("layout/layout_creative_no_network_0".equals(tag)) {
                    return new F(eVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_creative_no_network is invalid. Received: " + tag);
            case 17:
                if ("layout/layout_unlock_bauhaus_0".equals(tag)) {
                    return new H(eVar, view);
                }
                throw new IllegalArgumentException("The tag for layout_unlock_bauhaus is invalid. Received: " + tag);
            case 18:
                if ("layout/lock_screen_preview_layout_0".equals(tag)) {
                    return new J(eVar, view);
                }
                throw new IllegalArgumentException("The tag for lock_screen_preview_layout is invalid. Received: " + tag);
            case 19:
                if ("layout/my_photo_categrory_view_0".equals(tag)) {
                    return new L(eVar, view);
                }
                throw new IllegalArgumentException("The tag for my_photo_categrory_view is invalid. Received: " + tag);
            case 20:
                if ("layout/nt_category_item_0".equals(tag)) {
                    return new N(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_category_item is invalid. Received: " + tag);
            case 21:
                if ("layout/nt_category_item_empty_0".equals(tag)) {
                    return new P(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_category_item_empty is invalid. Received: " + tag);
            case 22:
                if ("layout/nt_category_item_foot_0".equals(tag)) {
                    return new S(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_category_item_foot is invalid. Received: " + tag);
            case 23:
                if ("layout/nt_category_place_holder_item_0".equals(tag)) {
                    return new U(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_category_place_holder_item is invalid. Received: " + tag);
            case 24:
                if ("layout/nt_category_view_0".equals(tag)) {
                    return new W(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_category_view is invalid. Received: " + tag);
            case 25:
                if ("layout/nt_creative_category_item_0".equals(tag)) {
                    return new Y(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_creative_category_item is invalid. Received: " + tag);
            case 26:
                if ("layout/nt_dialog_customization_reset_0".equals(tag)) {
                    return new C1313a0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_dialog_customization_reset is invalid. Received: " + tag);
            case 27:
                if ("layout/nt_effect_actions_layout_0".equals(tag)) {
                    return new C1317c0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_effect_actions_layout is invalid. Received: " + tag);
            case 28:
                if ("layout/nt_effect_button_0".equals(tag)) {
                    return new C1321e0(eVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for nt_effect_button is invalid. Received: " + tag);
            case 29:
                if ("layout/nt_fragment_category_selector_0".equals(tag)) {
                    return new C1325g0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_fragment_category_selector is invalid. Received: " + tag);
            case 30:
                if ("layout/nt_photo_view_0".equals(tag)) {
                    return new C1329i0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_photo_view is invalid. Received: " + tag);
            case 31:
                if ("layout/nt_preview_fragment_0".equals(tag)) {
                    return new k0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for nt_preview_fragment is invalid. Received: " + tag);
            case 32:
                if ("layout/preview_color_on_home_screen_0".equals(tag)) {
                    return new m0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for preview_color_on_home_screen is invalid. Received: " + tag);
            case 33:
                if ("layout/preview_color_on_picture_screen_0".equals(tag)) {
                    return new o0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for preview_color_on_picture_screen is invalid. Received: " + tag);
            case 34:
                if ("layout/shortcut_picker_item_0".equals(tag)) {
                    return new q0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for shortcut_picker_item is invalid. Received: " + tag);
            case 35:
                if ("layout/shortcut_picker_page_0".equals(tag)) {
                    return new s0(eVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for shortcut_picker_page is invalid. Received: " + tag);
            case 36:
                if ("layout/shortcut_preview_0".equals(tag)) {
                    return new u0(eVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for shortcut_preview is invalid. Received: " + tag);
            case 37:
                if ("layout/transition_image_view_0".equals(tag)) {
                    return new w0(eVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for transition_image_view is invalid. Received: " + tag);
            case 38:
                if ("layout/widget_delete_drop_view_0".equals(tag)) {
                    return new y0(eVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for widget_delete_drop_view is invalid. Received: " + tag);
            case 39:
                if ("layout/widget_list_head_0".equals(tag)) {
                    return new A0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for widget_list_head is invalid. Received: " + tag);
            case 40:
                if ("layout/widget_list_item_0".equals(tag)) {
                    return new C0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for widget_list_item is invalid. Received: " + tag);
            case 41:
                if ("layout/widget_picker_details_0".equals(tag)) {
                    return new E0(eVar, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for widget_picker_details is invalid. Received: " + tag);
            case 42:
                if ("layout/widget_picker_group_page_0".equals(tag)) {
                    return new G0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for widget_picker_group_page is invalid. Received: " + tag);
            case 43:
                if ("layout/widget_preview_item_0".equals(tag)) {
                    return new I0(eVar, view);
                }
                throw new IllegalArgumentException("The tag for widget_preview_item is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.d
    public g c(e eVar, View[] viewArr, int i10) {
        int i11;
        if (viewArr != null && viewArr.length != 0 && (i11 = f15836a.get(i10)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i11 == 2) {
                if ("layout/clock_host_edit_preview_0".equals(tag)) {
                    return new C1318d(eVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for clock_host_edit_preview is invalid. Received: " + tag);
            }
            if (i11 == 3) {
                if ("layout/clock_host_view_layout_0".equals(tag)) {
                    return new C1322f(eVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for clock_host_view_layout is invalid. Received: " + tag);
            }
            if (i11 == 4) {
                if ("layout/clock_picker_page_0".equals(tag)) {
                    return new C1326h(eVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for clock_picker_page is invalid. Received: " + tag);
            }
            if (i11 == 6) {
                if ("layout/clock_snapshot_list_view_0".equals(tag)) {
                    return new C1332l(eVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for clock_snapshot_list_view is invalid. Received: " + tag);
            }
            if (i11 == 28) {
                if ("layout/nt_effect_button_0".equals(tag)) {
                    return new C1321e0(eVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for nt_effect_button is invalid. Received: " + tag);
            }
            if (i11 == 41) {
                if ("layout/widget_picker_details_0".equals(tag)) {
                    return new E0(eVar, viewArr);
                }
                throw new IllegalArgumentException("The tag for widget_picker_details is invalid. Received: " + tag);
            }
            switch (i11) {
                case 35:
                    if ("layout/shortcut_picker_page_0".equals(tag)) {
                        return new s0(eVar, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for shortcut_picker_page is invalid. Received: " + tag);
                case 36:
                    if ("layout/shortcut_preview_0".equals(tag)) {
                        return new u0(eVar, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for shortcut_preview is invalid. Received: " + tag);
                case 37:
                    if ("layout/transition_image_view_0".equals(tag)) {
                        return new w0(eVar, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for transition_image_view is invalid. Received: " + tag);
                case 38:
                    if ("layout/widget_delete_drop_view_0".equals(tag)) {
                        return new y0(eVar, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for widget_delete_drop_view is invalid. Received: " + tag);
            }
        }
        return null;
    }
}
