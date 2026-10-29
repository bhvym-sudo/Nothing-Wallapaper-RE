.class public abstract LD8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
.end method

.method public final d(LD8/h;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-interface {p1}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LD8/j;->f(Ljava/util/Iterator;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_f

    return-object p0

    :cond_f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public abstract f(Ljava/util/Iterator;Lm8/e;)Ljava/lang/Object;
.end method
