.class final synthetic LH8/e$d;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/e;->d()LN8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final q:LH8/e$d;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LH8/e$d;

    invoke-direct {v0}, LH8/e$d;-><init>()V

    sput-object v0, LH8/e$d;->q:LH8/e$d;

    return-void
.end method

.method constructor <init>()V
    .registers 7

    const-string v4, "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, LH8/e;

    const-string v3, "registerSelectForReceive"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/l;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, LH8/e;

    check-cast p2, LN8/k;

    invoke-virtual {p0, p1, p2, p3}, LH8/e$d;->g(LH8/e;LN8/k;Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final g(LH8/e;LN8/k;Ljava/lang/Object;)V
    .registers 4

    invoke-static {p1, p2, p3}, LH8/e;->H(LH8/e;LN8/k;Ljava/lang/Object;)V

    return-void
.end method
