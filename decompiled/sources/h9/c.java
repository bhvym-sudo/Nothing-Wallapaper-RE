package h9;

import P8.E;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import g9.h;

/* JADX INFO: loaded from: classes2.dex */
final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gson f21883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeAdapter f21884b;

    c(Gson gson, TypeAdapter typeAdapter) {
        this.f21883a = gson;
        this.f21884b = typeAdapter;
    }

    @Override // g9.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object a(E e10) {
        JsonReader jsonReaderNewJsonReader = this.f21883a.newJsonReader(e10.a());
        try {
            Object obj = this.f21884b.read2(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            e10.close();
            return obj;
        } catch (Throwable th) {
            e10.close();
            throw th;
        }
    }
}
