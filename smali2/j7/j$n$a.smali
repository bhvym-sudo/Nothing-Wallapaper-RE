.class final synthetic Lj7/j$n$a;
.super Lkotlin/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .registers 9

    const-string v5, "buildEffectInfo(Lcom/nothing/wallpaper/effects/data/model/Effect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v6, 0x0

    const/4 v1, 0x2

    const-class v3, Lj7/j;

    const-string v4, "buildEffectInfo"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final g(LC6/e;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    check-cast p0, Lj7/j;

    invoke-static {p0, p1, p2}, Lj7/j;->p(Lj7/j;LC6/e;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LC6/e;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$n$a;->g(LC6/e;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
