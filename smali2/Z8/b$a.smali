.class public final LZ8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, LZ8/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LZ8/h;
    .registers 1

    invoke-virtual {p0}, LZ8/b$a;->b()Z

    move-result p0

    if-eqz p0, :cond_c

    new-instance p0, LZ8/b;

    invoke-direct {p0}, LZ8/b;-><init>()V

    return-object p0

    :cond_c
    const/4 p0, 0x0

    return-object p0
.end method

.method public final b()Z
    .registers 1

    invoke-static {}, LZ8/b;->p()Z

    move-result p0

    return p0
.end method
