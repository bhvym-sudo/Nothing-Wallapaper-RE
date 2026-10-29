.class final LF8/v0;
.super LF8/C0;
.source "SourceFile"


# static fields
.field private static final synthetic v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _invoked$volatile:I

.field private final u:Lv8/l;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-class v0, LF8/v0;

    const-string v1, "_invoked$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LF8/v0;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lv8/l;)V
    .registers 2

    invoke-direct {p0}, LF8/C0;-><init>()V

    iput-object p1, p0, LF8/v0;->u:Lv8/l;

    return-void
.end method

.method private static final synthetic y()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .registers 1

    sget-object v0, LF8/v0;->v:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method


# virtual methods
.method public v()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public w(Ljava/lang/Throwable;)V
    .registers 5

    invoke-static {}, LF8/v0;->y()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object p0, p0, LF8/v0;->u:Lv8/l;

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    return-void
.end method
