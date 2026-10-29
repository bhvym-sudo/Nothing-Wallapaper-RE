.class abstract LD8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lv8/p;)Ljava/util/Iterator;
    .registers 2

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD8/i;

    invoke-direct {v0}, LD8/i;-><init>()V

    invoke-static {p0, v0, v0}, Ln8/b;->a(Lv8/p;Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    invoke-virtual {v0, p0}, LD8/i;->l(Lm8/e;)V

    return-object v0
.end method

.method public static b(Lv8/p;)LD8/h;
    .registers 2

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD8/l$a;

    invoke-direct {v0, p0}, LD8/l$a;-><init>(Lv8/p;)V

    return-object v0
.end method
