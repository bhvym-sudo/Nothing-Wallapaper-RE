.class public final LJ7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ7/o;


# static fields
.field public static final a:LJ7/l;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LJ7/l;

    invoke-direct {v0}, LJ7/l;-><init>()V

    sput-object v0, LJ7/l;->a:LJ7/l;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LU5/a;)V
    .registers 2

    const-string p0, "repository"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LU5/a;->f()V

    return-void
.end method

.method public b(LF8/L;LU5/a;Z)V
    .registers 4

    const-string p0, "scope"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "repository"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p3}, LU5/a;->a(Z)V

    return-void
.end method

.method public c(LF8/L;LU5/a;)V
    .registers 9

    const-string p0, "scope"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "repository"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LJ7/l$a;

    const/4 p0, 0x0

    invoke-direct {v3, p2, p0}, LJ7/l$a;-><init>(LU5/a;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public d(LF8/L;LU5/a;)V
    .registers 3

    const-string p0, "scope"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "repository"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public e(LF8/L;LU5/a;Lh8/o;)V
    .registers 4

    const-string p0, "scope"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "repository"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "info"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p3}, LU5/a;->q(Lh8/o;)V

    return-void
.end method

.method public f(LF8/L;LU5/a;)V
    .registers 3

    const-string p0, "scope"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "repository"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LU5/a;->v()V

    return-void
.end method

.method public g(LF8/L;LU5/a;I)V
    .registers 4

    const-string p0, "scope"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "repository"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p3}, LU5/a;->y(I)V

    return-void
.end method
