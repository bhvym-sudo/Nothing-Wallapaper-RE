package h9;

import P8.C;
import P8.x;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import e9.C1350e;
import g9.h;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
final class b implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final x f21880c = x.d("application/json; charset=UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f21881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeAdapter f21882b;

    b(Gson gson, TypeAdapter typeAdapter) {
        this.f21881a = gson;
        this.f21882b = typeAdapter;
    }

    @Override // g9.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C a(Object obj) throws IOException {
        C1350e c1350e = new C1350e();
        JsonWriter jsonWriterNewJsonWriter = this.f21881a.newJsonWriter(new OutputStreamWriter(c1350e.b1(), StandardCharsets.UTF_8));
        this.f21882b.write(jsonWriterNewJsonWriter, obj);
        jsonWriterNewJsonWriter.close();
        return C.c(f21880c, c1350e.w0());
    }
}
