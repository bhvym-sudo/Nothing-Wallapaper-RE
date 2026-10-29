.class public final LP8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LU8/g;


# direct methods
.method public constructor <init>()V
    .registers 5

    const-wide/16 v0, 0x5

    .line 6
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v3, 0x5

    invoke-direct {p0, v3, v0, v1, v2}, LP8/k;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .registers 12

    const-string v0, "timeUnit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v1, LU8/g;

    .line 4
    sget-object v2, LT8/e;->i:LT8/e;

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    .line 5
    invoke-direct/range {v1 .. v6}, LU8/g;-><init>(LT8/e;IJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0, v1}, LP8/k;-><init>(LU8/g;)V

    return-void
.end method

.method public constructor <init>(LU8/g;)V
    .registers 3

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LP8/k;->a:LU8/g;

    return-void
.end method


# virtual methods
.method public final a()LU8/g;
    .registers 1

    iget-object p0, p0, LP8/k;->a:LU8/g;

    return-object p0
.end method
