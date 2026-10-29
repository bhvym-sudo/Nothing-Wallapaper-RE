.class public final Ly6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly6/a;

.field private static final b:Lq6/b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Ly6/a;

    invoke-direct {v0}, Ly6/a;-><init>()V

    sput-object v0, Ly6/a;->a:Ly6/a;

    new-instance v1, Lq6/b;

    invoke-direct {v1, v0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    sput-object v1, Ly6/a;->b:Lq6/b;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lq6/b;
    .registers 1

    sget-object v0, Ly6/a;->b:Lq6/b;

    return-object v0
.end method


# virtual methods
.method public final b(Landroid/content/Context;)V
    .registers 14

    const-string p0, "appContext"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p0

    instance-of v0, p0, LK1/a;

    if-eqz v0, :cond_15

    check-cast p0, LK1/a;

    :goto_13
    move-object v2, p0

    goto :goto_17

    :cond_15
    const/4 p0, 0x0

    goto :goto_13

    :goto_17
    if-nez v2, :cond_1a

    return-void

    :cond_1a
    invoke-interface {v2, p1}, Lh3/H;->f(Landroid/content/Context;)Lh3/W;

    move-result-object v1

    sget-object p0, LF8/r0;->q:LF8/r0;

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v7

    new-instance v0, Ly6/a$a;

    const/4 v6, 0x0

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Ly6/a$a;-><init>(Lh3/W;LK1/a;Landroid/content/Context;JLm8/e;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v6, p0

    move-object v9, v0

    invoke-static/range {v6 .. v11}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method
