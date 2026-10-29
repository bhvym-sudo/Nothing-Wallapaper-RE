.class public final LU8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/w;


# static fields
.field public static final a:LU8/a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LU8/a;

    invoke-direct {v0}, LU8/a;-><init>()V

    sput-object v0, LU8/a;->a:LU8/a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LP8/w$a;)LP8/D;
    .registers 11

    const-string p0, "chain"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, LV8/g;

    invoke-virtual {v0}, LV8/g;->f()LU8/e;

    move-result-object p0

    invoke-virtual {p0, v0}, LU8/e;->v(LV8/g;)LU8/c;

    move-result-object v2

    const/16 v7, 0x3d

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, LV8/g;->e(LV8/g;ILU8/c;LP8/B;IIIILjava/lang/Object;)LV8/g;

    move-result-object p0

    invoke-virtual {v0}, LV8/g;->j()LP8/B;

    move-result-object p1

    invoke-virtual {p0, p1}, LV8/g;->a(LP8/B;)LP8/D;

    move-result-object p0

    return-object p0
.end method
