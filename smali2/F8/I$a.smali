.class public final LF8/I$a;
.super Lm8/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF8/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 3

    .line 2
    sget-object v0, Lm8/f;->l:Lm8/f$b;

    new-instance v1, LF8/H;

    invoke-direct {v1}, LF8/H;-><init>()V

    .line 3
    invoke-direct {p0, v0, v1}, Lm8/b;-><init>(Lm8/i$c;Lv8/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, LF8/I$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Lm8/i$b;)LF8/I;
    .registers 1

    invoke-static {p0}, LF8/I$a;->d(Lm8/i$b;)LF8/I;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lm8/i$b;)LF8/I;
    .registers 2

    instance-of v0, p0, LF8/I;

    if-eqz v0, :cond_7

    check-cast p0, LF8/I;

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method
