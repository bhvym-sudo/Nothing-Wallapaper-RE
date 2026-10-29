.class public abstract LJ8/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lv8/q;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    sget-object v0, LJ8/w$a;->q:LJ8/w$a;

    const-string v1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/I;->d(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv8/q;

    sput-object v0, LJ8/w;->a:Lv8/q;

    return-void
.end method

.method public static final synthetic a()Lv8/q;
    .registers 1

    sget-object v0, LJ8/w;->a:Lv8/q;

    return-object v0
.end method
