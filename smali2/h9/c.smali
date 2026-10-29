.class final Lh9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/h;


# instance fields
.field private final a:Lcom/google/gson/Gson;

.field private final b:Lcom/google/gson/TypeAdapter;


# direct methods
.method constructor <init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh9/c;->a:Lcom/google/gson/Gson;

    iput-object p2, p0, Lh9/c;->b:Lcom/google/gson/TypeAdapter;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, LP8/E;

    invoke-virtual {p0, p1}, Lh9/c;->b(LP8/E;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public b(LP8/E;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lh9/c;->a:Lcom/google/gson/Gson;

    invoke-virtual {p1}, LP8/E;->a()Ljava/io/Reader;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->newJsonReader(Ljava/io/Reader;)Lcom/google/gson/stream/JsonReader;

    move-result-object v0

    :try_start_a
    iget-object p0, p0, Lh9/c;->b:Lcom/google/gson/TypeAdapter;

    invoke-virtual {p0, v0}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/google/gson/stream/JsonToken;->END_DOCUMENT:Lcom/google/gson/stream/JsonToken;
    :try_end_16
    .catchall {:try_start_a .. :try_end_16} :catchall_24

    if-ne v0, v1, :cond_1c

    invoke-virtual {p1}, LP8/E;->close()V

    return-object p0

    :cond_1c
    :try_start_1c
    new-instance p0, Lcom/google/gson/JsonIOException;

    const-string v0, "JSON document was not fully consumed."

    invoke-direct {p0, v0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_24
    .catchall {:try_start_1c .. :try_end_24} :catchall_24

    :catchall_24
    move-exception p0

    invoke-virtual {p1}, LP8/E;->close()V

    throw p0
.end method
