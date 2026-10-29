.class public final LF8/V0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF8/V0;

.field private static final b:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LF8/V0;

    invoke-direct {v0}, LF8/V0;-><init>()V

    sput-object v0, LF8/V0;->a:LF8/V0;

    new-instance v0, LK8/D;

    const-string v1, "ThreadLocalEventLoop"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, LK8/L;->a(LK8/D;)Ljava/lang/ThreadLocal;

    move-result-object v0

    sput-object v0, LF8/V0;->b:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LF8/h0;
    .registers 1

    sget-object p0, LF8/V0;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/h0;

    return-object p0
.end method

.method public final b()LF8/h0;
    .registers 2

    sget-object p0, LF8/V0;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF8/h0;

    if-nez v0, :cond_11

    invoke-static {}, LF8/k0;->a()LF8/h0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_11
    return-object v0
.end method

.method public final c()V
    .registers 2

    sget-object p0, LF8/V0;->b:Ljava/lang/ThreadLocal;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(LF8/h0;)V
    .registers 2

    sget-object p0, LF8/V0;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
