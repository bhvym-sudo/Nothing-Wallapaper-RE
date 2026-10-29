.class public abstract LN8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lv8/q;

.field private static final b:LK8/D;

.field private static final c:LK8/D;

.field private static final d:LK8/D;

.field private static final e:LK8/D;

.field private static final f:LK8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    sget-object v0, LN8/l$a;->q:LN8/l$a;

    sput-object v0, LN8/l;->a:Lv8/q;

    new-instance v0, LK8/D;

    const-string v1, "STATE_REG"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LN8/l;->b:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "STATE_COMPLETED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LN8/l;->c:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "STATE_CANCELLED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LN8/l;->d:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "NO_RESULT"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LN8/l;->e:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "PARAM_CLAUSE_0"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LN8/l;->f:LK8/D;

    return-void
.end method

.method private static final a(I)LN8/m;
    .registers 4

    if-eqz p0, :cond_2f

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2c

    const/4 v0, 0x2

    if-eq p0, v0, :cond_29

    const/4 v0, 0x3

    if-ne p0, v0, :cond_e

    sget-object p0, LN8/m;->t:LN8/m;

    return-object p0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected internal result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    sget-object p0, LN8/m;->s:LN8/m;

    return-object p0

    :cond_2c
    sget-object p0, LN8/m;->r:LN8/m;

    return-object p0

    :cond_2f
    sget-object p0, LN8/m;->q:LN8/m;

    return-object p0
.end method

.method public static final synthetic b(I)LN8/m;
    .registers 1

    invoke-static {p0}, LN8/l;->a(I)LN8/m;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lv8/q;
    .registers 1

    sget-object v0, LN8/l;->a:Lv8/q;

    return-object v0
.end method

.method public static final synthetic d()LK8/D;
    .registers 1

    sget-object v0, LN8/l;->e:LK8/D;

    return-object v0
.end method

.method public static final synthetic e()LK8/D;
    .registers 1

    sget-object v0, LN8/l;->d:LK8/D;

    return-object v0
.end method

.method public static final synthetic f()LK8/D;
    .registers 1

    sget-object v0, LN8/l;->c:LK8/D;

    return-object v0
.end method

.method public static final synthetic g()LK8/D;
    .registers 1

    sget-object v0, LN8/l;->b:LK8/D;

    return-object v0
.end method

.method public static final synthetic h(LF8/l;Lv8/q;)Z
    .registers 2

    invoke-static {p0, p1}, LN8/l;->j(LF8/l;Lv8/q;)Z

    move-result p0

    return p0
.end method

.method public static final i()LK8/D;
    .registers 1

    sget-object v0, LN8/l;->f:LK8/D;

    return-object v0
.end method

.method private static final j(LF8/l;Lv8/q;)Z
    .registers 4

    sget-object v0, Lh8/A;->a:Lh8/A;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1, p1}, LF8/l;->r(Ljava/lang/Object;Ljava/lang/Object;Lv8/q;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_b

    const/4 p0, 0x0

    return p0

    :cond_b
    invoke-interface {p0, p1}, LF8/l;->t(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method
