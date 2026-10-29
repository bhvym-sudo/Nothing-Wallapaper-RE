.class final synthetic LJ8/w$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ8/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final q:LJ8/w$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LJ8/w$a;

    invoke-direct {v0}, LJ8/w$a;-><init>()V

    sput-object v0, LJ8/w$a;->q:LJ8/w$a;

    return-void
.end method

.method constructor <init>()V
    .registers 7

    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v5, 0x0

    const/4 v1, 0x3

    const-class v2, LI8/g;

    const-string v3, "emit"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/l;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, LI8/g;

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, LJ8/w$a;->g(LI8/g;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final g(LI8/g;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-interface {p1, p2, p3}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
