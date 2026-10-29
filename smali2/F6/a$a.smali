.class public final LF6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF6/a;
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
    invoke-direct {p0}, LF6/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .registers 1

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p0

    invoke-interface {p0}, Lh3/H;->C()Ld3/a;

    move-result-object p0

    invoke-virtual {p0}, Ld3/a;->r()Z

    move-result p0

    return p0
.end method
