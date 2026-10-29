.class final Lh9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/h;


# static fields
.field private static final c:LP8/x;


# instance fields
.field private final a:Lcom/google/gson/Gson;

.field private final b:Lcom/google/gson/TypeAdapter;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, LP8/x;->d(Ljava/lang/String;)LP8/x;

    move-result-object v0

    sput-object v0, Lh9/b;->c:LP8/x;

    return-void
.end method

.method constructor <init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/b;->a:Lcom/google/gson/Gson;

    iput-object p2, p0, Lh9/b;->b:Lcom/google/gson/TypeAdapter;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, Lh9/b;->b(Ljava/lang/Object;)LP8/C;

    move-result-object p0

    return-object p0
.end method

.method public b(Ljava/lang/Object;)LP8/C;
    .registers 6

    new-instance v0, Le9/e;

    invoke-direct {v0}, Le9/e;-><init>()V

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-virtual {v0}, Le9/e;->b1()Ljava/io/OutputStream;

    move-result-object v2

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    iget-object v2, p0, Lh9/b;->a:Lcom/google/gson/Gson;

    invoke-virtual {v2, v1}, Lcom/google/gson/Gson;->newJsonWriter(Ljava/io/Writer;)Lcom/google/gson/stream/JsonWriter;

    move-result-object v1

    iget-object p0, p0, Lh9/b;->b:Lcom/google/gson/TypeAdapter;

    invoke-virtual {p0, v1, p1}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/google/gson/stream/JsonWriter;->close()V

    sget-object p0, Lh9/b;->c:LP8/x;

    invoke-virtual {v0}, Le9/e;->w0()Le9/h;

    move-result-object p1

    invoke-static {p0, p1}, LP8/C;->c(LP8/x;Le9/h;)LP8/C;

    move-result-object p0

    return-object p0
.end method
