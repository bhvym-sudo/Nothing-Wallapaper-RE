package p166q5;

import android.app.WallpaperColors;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import com.google.gson.Gson;
import java.io.File;
import java.io.PrintWriter;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f25076a = new v();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Integer f25078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Integer f25079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f25080d;

        public a(int i10, Integer num, Integer num2, int i11) {
            this.f25077a = i10;
            this.f25078b = num;
            this.f25079c = num2;
            this.f25080d = i11;
        }

        public final WallpaperColors a() {
            Color colorValueOf = Color.valueOf(this.f25077a);
            Integer num = this.f25078b;
            Color colorValueOf2 = num != null ? Color.valueOf(num.intValue()) : null;
            Integer num2 = this.f25079c;
            return new WallpaperColors(colorValueOf, colorValueOf2, num2 != null ? Color.valueOf(num2.intValue()) : null, this.f25080d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25077a == aVar.f25077a && n.d(this.f25078b, aVar.f25078b) && n.d(this.f25079c, aVar.f25079c) && this.f25080d == aVar.f25080d;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f25077a) * 31;
            Integer num = this.f25078b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f25079c;
            return ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + Integer.hashCode(this.f25080d);
        }

        public String toString() {
            return "Colors(primaryColor=" + this.f25077a + ", secondaryColor=" + this.f25078b + ", tertiaryColor=" + this.f25079c + ", colorHints=" + this.f25080d + ")";
        }
    }

    private v() {
    }

    public final void a(Context context) {
        n.h(context, "context");
        SharedPreferences.Editor editorEdit = d(context).edit();
        editorEdit.remove("final_image_path");
        editorEdit.remove("final_vertex_infos");
        editorEdit.remove("final_colors");
        editorEdit.commit();
    }

    public final void b(Context context, PrintWriter writer) {
        n.h(context, "context");
        n.h(writer, "writer");
        SharedPreferences sharedPreferencesD = d(context);
        writer.println("Atmosphere SP Info");
        writer.println("    Final:");
        String string = sharedPreferencesD.getString("final_image_path", null);
        writer.println("        path " + string + ", file exists " + (string == null ? false : new File(string).exists()));
        String string2 = sharedPreferencesD.getString("final_vertex_infos", null);
        StringBuilder sb = new StringBuilder();
        sb.append("        vertex ");
        sb.append(string2);
        writer.println(sb.toString());
        writer.println("        colors " + sharedPreferencesD.getString("final_colors", null));
    }

    public final WallpaperColors c(Context context) {
        n.h(context, "context");
        String string = d(context).getString("final_colors", null);
        if (string != null) {
            return ((a) new Gson().fromJson(string, a.class)).a();
        }
        return null;
    }

    public final SharedPreferences d(Context context) {
        n.h(context, "context");
        SharedPreferences sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences("atmosphere_preferences", 0);
        n.g(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final void e(Context context, WallpaperColors colors) {
        n.h(context, "context");
        n.h(colors, "colors");
        SharedPreferences.Editor editorEdit = d(context).edit();
        Gson gson = new Gson();
        int argb = colors.getPrimaryColor().toArgb();
        Color secondaryColor = colors.getSecondaryColor();
        Integer numValueOf = secondaryColor != null ? Integer.valueOf(secondaryColor.toArgb()) : null;
        Color tertiaryColor = colors.getTertiaryColor();
        editorEdit.putString("final_colors", gson.toJson(new a(argb, numValueOf, tertiaryColor != null ? Integer.valueOf(tertiaryColor.toArgb()) : null, colors.getColorHints())));
        editorEdit.commit();
    }
}
