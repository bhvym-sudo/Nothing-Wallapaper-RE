package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class E extends F0.c implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final SearchView f10761B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final SearchableInfo f10762C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Context f10763D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final WeakHashMap f10764E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f10765F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f10766G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f10767H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private ColorStateList f10768I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f10769J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f10770K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f10771L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f10772M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f10773N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f10774O;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f10775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f10776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f10777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f10778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f10779e;

        public a(View view) {
            this.f10775a = (TextView) view.findViewById(R.id.text1);
            this.f10776b = (TextView) view.findViewById(R.id.text2);
            this.f10777c = (ImageView) view.findViewById(R.id.icon1);
            this.f10778d = (ImageView) view.findViewById(R.id.icon2);
            this.f10779e = (ImageView) view.findViewById(p050f.f.f20446q);
        }
    }

    public E(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f10766G = false;
        this.f10767H = 1;
        this.f10769J = -1;
        this.f10770K = -1;
        this.f10771L = -1;
        this.f10772M = -1;
        this.f10773N = -1;
        this.f10774O = -1;
        this.f10761B = searchView;
        this.f10762C = searchableInfo;
        this.f10765F = searchView.getSuggestionCommitIconResId();
        this.f10763D = context;
        this.f10764E = weakHashMap;
    }

    private Drawable g(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10764E.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence h(CharSequence charSequence) {
        if (this.f10768I == null) {
            TypedValue typedValue = new TypedValue();
            this.f10763D.getTheme().resolveAttribute(p050f.a.f20332L, typedValue, true);
            this.f10768I = this.f10763D.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f10768I, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable i(ComponentName componentName) {
        PackageManager packageManager = this.f10763D.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, Optimizer.OPTIMIZATION_GRAPH_WRAP);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    private Drawable j(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f10764E.containsKey(strFlattenToShortString)) {
            Drawable drawableI = i(componentName);
            this.f10764E.put(strFlattenToShortString, drawableI != null ? drawableI.getConstantState() : null);
            return drawableI;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f10764E.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f10763D.getResources());
    }

    public static String k(Cursor cursor, String str) {
        return s(cursor, cursor.getColumnIndex(str));
    }

    private Drawable l() {
        Drawable drawableJ = j(this.f10762C.getSearchActivity());
        return drawableJ != null ? drawableJ : this.f10763D.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable m(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return n(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f10763D.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException e10) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                    return drawableCreateFromStream;
                }
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e11) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                }
                throw th;
            }
        } catch (FileNotFoundException e12) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
        return null;
    }

    private Drawable o(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f10763D.getPackageName() + "/" + i10;
            Drawable drawableG = g(str2);
            if (drawableG != null) {
                return drawableG;
            }
            Drawable drawableD = p171r0.a.d(this.f10763D, i10);
            w(str2, drawableD);
            return drawableD;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableG2 = g(str);
            if (drawableG2 != null) {
                return drawableG2;
            }
            Drawable drawableM = m(Uri.parse(str));
            w(str, drawableM);
            return drawableM;
        }
    }

    private Drawable p(Cursor cursor) {
        int i10 = this.f10772M;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableO = o(cursor.getString(i10));
        return drawableO != null ? drawableO : l();
    }

    private Drawable q(Cursor cursor) {
        int i10 = this.f10773N;
        if (i10 == -1) {
            return null;
        }
        return o(cursor.getString(i10));
    }

    private static String s(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    private void u(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void v(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void w(String str, Drawable drawable) {
        if (drawable != null) {
            this.f10764E.put(str, drawable.getConstantState());
        }
    }

    private void x(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // F0.a
    public void a(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f10774O;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f10775a != null) {
            v(aVar.f10775a, s(cursor, this.f10769J));
        }
        if (aVar.f10776b != null) {
            String strS = s(cursor, this.f10771L);
            CharSequence charSequenceH = strS != null ? h(strS) : s(cursor, this.f10770K);
            if (TextUtils.isEmpty(charSequenceH)) {
                TextView textView = aVar.f10775a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f10775a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f10775a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f10775a.setMaxLines(1);
                }
            }
            v(aVar.f10776b, charSequenceH);
        }
        ImageView imageView = aVar.f10777c;
        if (imageView != null) {
            u(imageView, p(cursor), 4);
        }
        ImageView imageView2 = aVar.f10778d;
        if (imageView2 != null) {
            u(imageView2, q(cursor), 8);
        }
        int i12 = this.f10767H;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f10779e.setVisibility(8);
            return;
        }
        aVar.f10779e.setVisibility(0);
        aVar.f10779e.setTag(aVar.f10775a.getText());
        aVar.f10779e.setOnClickListener(this);
    }

    @Override // F0.a, F0.b.a
    public void changeCursor(Cursor cursor) {
        if (this.f10766G) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f10769J = cursor.getColumnIndex("suggest_text_1");
                this.f10770K = cursor.getColumnIndex("suggest_text_2");
                this.f10771L = cursor.getColumnIndex("suggest_text_2_url");
                this.f10772M = cursor.getColumnIndex("suggest_icon_1");
                this.f10773N = cursor.getColumnIndex("suggest_icon_2");
                this.f10774O = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // F0.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strK;
        String strK2;
        if (cursor == null) {
            return null;
        }
        String strK3 = k(cursor, "suggest_intent_query");
        if (strK3 != null) {
            return strK3;
        }
        if (this.f10762C.shouldRewriteQueryFromData() && (strK2 = k(cursor, "suggest_intent_data")) != null) {
            return strK2;
        }
        if (!this.f10762C.shouldRewriteQueryFromText() || (strK = k(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strK;
    }

    @Override // F0.c, F0.a
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewD = super.d(context, cursor, viewGroup);
        viewD.setTag(new a(viewD));
        ((ImageView) viewD.findViewById(p050f.f.f20446q)).setImageResource(this.f10765F);
        return viewD;
    }

    @Override // F0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewC = c(this.f10763D, getCursor(), viewGroup);
            if (viewC != null) {
                ((a) viewC.getTag()).f10775a.setText(e10.toString());
            }
            return viewC;
        }
    }

    @Override // F0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewD = d(this.f10763D, getCursor(), viewGroup);
            if (viewD != null) {
                ((a) viewD.getTag()).f10775a.setText(e10.toString());
            }
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    Drawable n(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f10763D.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        x(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        x(getCursor());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f10761B.M((CharSequence) tag);
        }
    }

    Cursor r(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f10763D.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // F0.b.a
    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f10761B.getVisibility() == 0 && this.f10761B.getWindowVisibility() == 0) {
            try {
                Cursor cursorR = r(this.f10762C, string, 50);
                if (cursorR != null) {
                    cursorR.getCount();
                    return cursorR;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    public void t(int i10) {
        this.f10767H = i10;
    }
}
