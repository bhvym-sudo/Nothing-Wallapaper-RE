.class public abstract Lm8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lv8/p;Ljava/lang/Object;Lm8/e;)V
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Ln8/b;->a(Lv8/p;Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    invoke-static {p0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object p0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
