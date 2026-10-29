package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import p032d1.c;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Context f13486e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final ArrayAdapter f13487f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private Spinner f13488g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f13489h0;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j9) {
            if (i10 >= 0) {
                String string = DropDownPreference.this.M()[i10].toString();
                if (string.equals(DropDownPreference.this.N()) || !DropDownPreference.this.d(string)) {
                    return;
                }
                DropDownPreference.this.P(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f19423c);
    }

    private void R() {
        this.f13487f0.clear();
        if (K() != null) {
            for (CharSequence charSequence : K()) {
                this.f13487f0.add(charSequence.toString());
            }
        }
    }

    protected ArrayAdapter Q() {
        return new ArrayAdapter(this.f13486e0, R.layout.simple_spinner_dropdown_item);
    }

    @Override // androidx.preference.Preference
    protected void v() {
        super.v();
        ArrayAdapter arrayAdapter = this.f13487f0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void x() {
        this.f13488g0.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f13489h0 = new a();
        this.f13486e0 = context;
        this.f13487f0 = Q();
        R();
    }
}
