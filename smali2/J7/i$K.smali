.class public final LJ7/i$K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i;-><init>(LU5/a;LB7/a;Lh3/c;Landroidx/lifecycle/Q;Landroid/content/Context;LM1/b;LF8/I;LS1/a;Landroid/content/res/Resources;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/text/Collator;

.field final synthetic b:LJ7/i;


# direct methods
.method constructor <init>(LJ7/i;)V
    .registers 3

    iput-object p1, p0, LJ7/i$K;->b:LJ7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object p1

    const-string v0, "getInstance(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LJ7/i$K;->a:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public a(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/j;)I
    .registers 6

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF5/m;->G()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, LF5/m;->G()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_29

    if-eqz v1, :cond_29

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_29

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->i(II)I

    move-result p0

    return p0

    :cond_29
    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->B0()I

    move-result v0

    invoke-virtual {p2}, Lcom/nothing/launcher/card/j;->B0()I

    move-result v1

    if-ne v0, v1, :cond_58

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->C0()I

    move-result v0

    invoke-virtual {p2}, Lcom/nothing/launcher/card/j;->C0()I

    move-result v1

    if-ne v0, v1, :cond_58

    iget-object v0, p0, LJ7/i$K;->a:Ljava/text/Collator;

    iget-object v1, p0, LJ7/i$K;->b:LJ7/i;

    invoke-static {v1}, LJ7/i;->k(LJ7/i;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, LF5/m;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, LJ7/i$K;->b:LJ7/i;

    invoke-static {p0}, LJ7/i;->k(LJ7/i;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p2, p0}, LF5/m;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_58
    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->B0()I

    move-result p0

    invoke-virtual {p2}, Lcom/nothing/launcher/card/j;->B0()I

    move-result v0

    if-ne p0, v0, :cond_6f

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->C0()I

    move-result p0

    invoke-virtual {p2}, Lcom/nothing/launcher/card/j;->C0()I

    move-result p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->i(II)I

    move-result p0

    return p0

    :cond_6f
    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->B0()I

    move-result p0

    invoke-virtual {p2}, Lcom/nothing/launcher/card/j;->B0()I

    move-result p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->i(II)I

    move-result p0

    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .registers 3

    check-cast p1, Lcom/nothing/launcher/card/j;

    check-cast p2, Lcom/nothing/launcher/card/j;

    invoke-virtual {p0, p1, p2}, LJ7/i$K;->a(Lcom/nothing/launcher/card/j;Lcom/nothing/launcher/card/j;)I

    move-result p0

    return p0
.end method
