.class public final LD6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD6/h$b;,
        LD6/h$c;
    }
.end annotation


# static fields
.field public static final f:LD6/h$b;


# instance fields
.field private final a:Lv8/p;

.field private final b:Lq6/b;

.field private final c:LI8/z;

.field private final d:LI8/z;

.field private volatile e:J


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LD6/h$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD6/h$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LD6/h;->f:LD6/h$b;

    return-void
.end method

.method public constructor <init>(LF8/L;JLv8/p;)V
    .registers 11

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, LD6/h;->a:Lv8/p;

    new-instance p4, Lq6/b;

    invoke-direct {p4, p0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    iput-object p4, p0, LD6/h;->b:Lq6/b;

    sget-object p4, LH8/a;->r:LH8/a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v1, p4}, LI8/G;->a(IILH8/a;)LI8/z;

    move-result-object p4

    iput-object p4, p0, LD6/h;->c:LI8/z;

    sget-object p4, LH8/a;->q:LH8/a;

    invoke-static {v0, v1, p4}, LI8/G;->a(IILH8/a;)LI8/z;

    move-result-object p4

    iput-object p4, p0, LD6/h;->d:LI8/z;

    new-instance v3, LD6/h$a;

    const/4 p4, 0x0

    invoke-direct {v3, p0, p2, p3, p4}, LD6/h$a;-><init>(LD6/h;JLm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public static final synthetic a(LD6/h;)LI8/z;
    .registers 1

    iget-object p0, p0, LD6/h;->d:LI8/z;

    return-object p0
.end method

.method public static final synthetic b(LD6/h;)J
    .registers 3

    iget-wide v0, p0, LD6/h;->e:J

    return-wide v0
.end method

.method public static final synthetic c(LD6/h;)Lq6/b;
    .registers 1

    iget-object p0, p0, LD6/h;->b:Lq6/b;

    return-object p0
.end method

.method public static final synthetic d(LD6/h;J)V
    .registers 3

    iput-wide p1, p0, LD6/h;->e:J

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 6

    iget-object v0, p0, LD6/h;->b:Lq6/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "emit "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object p0, p0, LD6/h;->d:LI8/z;

    invoke-interface {p0, p1, p2}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_23

    return-object p0

    :cond_23
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final f()Lv8/p;
    .registers 1

    iget-object p0, p0, LD6/h;->a:Lv8/p;

    return-object p0
.end method

.method public final g()LI8/z;
    .registers 1

    iget-object p0, p0, LD6/h;->c:LI8/z;

    return-object p0
.end method
