.class public final Lh9/a;
.super Lg9/h$a;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/gson/Gson;


# direct methods
.method private constructor <init>(Lcom/google/gson/Gson;)V
    .registers 2

    invoke-direct {p0}, Lg9/h$a;-><init>()V

    iput-object p1, p0, Lh9/a;->a:Lcom/google/gson/Gson;

    return-void
.end method

.method public static f()Lh9/a;
    .registers 1

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-static {v0}, Lh9/a;->g(Lcom/google/gson/Gson;)Lh9/a;

    move-result-object v0

    return-object v0
.end method

.method public static g(Lcom/google/gson/Gson;)Lh9/a;
    .registers 2

    if-eqz p0, :cond_8

    new-instance v0, Lh9/a;

    invoke-direct {v0, p0}, Lh9/a;-><init>(Lcom/google/gson/Gson;)V

    return-object v0

    :cond_8
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "gson == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public c(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lg9/y;)Lg9/h;
    .registers 5

    iget-object p2, p0, Lh9/a;->a:Lcom/google/gson/Gson;

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    move-result-object p1

    new-instance p2, Lh9/b;

    iget-object p0, p0, Lh9/a;->a:Lcom/google/gson/Gson;

    invoke-direct {p2, p0, p1}, Lh9/b;-><init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V

    return-object p2
.end method

.method public d(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lg9/y;)Lg9/h;
    .registers 4

    iget-object p2, p0, Lh9/a;->a:Lcom/google/gson/Gson;

    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/google/gson/Gson;->getAdapter(Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;

    move-result-object p1

    new-instance p2, Lh9/c;

    iget-object p0, p0, Lh9/a;->a:Lcom/google/gson/Gson;

    invoke-direct {p2, p0, p1}, Lh9/c;-><init>(Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V

    return-object p2
.end method
