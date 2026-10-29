.class final synthetic LN8/b$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN8/b;->c()LN8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final q:LN8/b$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LN8/b$a;

    invoke-direct {v0}, LN8/b$a;-><init>()V

    sput-object v0, LN8/b$a;->q:LN8/b$a;

    return-void
.end method

.method constructor <init>()V
    .registers 7

    const-string v4, "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, LN8/b;

    const-string v3, "register"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/l;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, LN8/b;

    check-cast p2, LN8/k;

    invoke-virtual {p0, p1, p2, p3}, LN8/b$a;->g(LN8/b;LN8/k;Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final g(LN8/b;LN8/k;Ljava/lang/Object;)V
    .registers 4

    invoke-static {p1, p2, p3}, LN8/b;->b(LN8/b;LN8/k;Ljava/lang/Object;)V

    return-void
.end method
