.class public final Lm8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/i;
.implements Ljava/io/Serializable;


# static fields
.field public static final q:Lm8/j;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lm8/j;

    invoke-direct {v0}, Lm8/j;-><init>()V

    sput-object v0, Lm8/j;->q:Lm8/j;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;
    .registers 3

    const-string p0, "operation"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Lm8/i$c;)Lm8/i$b;
    .registers 2

    const-string p0, "key"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public hashCode()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public t0(Lm8/i$c;)Lm8/i;
    .registers 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "EmptyCoroutineContext"

    return-object p0
.end method

.method public z(Lm8/i;)Lm8/i;
    .registers 2

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
