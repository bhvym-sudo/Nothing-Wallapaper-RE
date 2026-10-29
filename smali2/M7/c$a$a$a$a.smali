.class final LM7/c$a$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM7/c$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Landroid/widget/LinearLayout;

.field final synthetic r:Landroid/content/Context;

.field final synthetic s:Lw7/a;


# direct methods
.method constructor <init>(Landroid/widget/LinearLayout;Landroid/content/Context;Lw7/a;)V
    .registers 4

    iput-object p1, p0, LM7/c$a$a$a$a;->q:Landroid/widget/LinearLayout;

    iput-object p2, p0, LM7/c$a$a$a$a;->r:Landroid/content/Context;

    iput-object p3, p0, LM7/c$a$a$a$a;->s:Lw7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lu7/c;Lm8/e;)Ljava/lang/Object;
    .registers 9

    instance-of v0, p2, LM7/c$a$a$a$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LM7/c$a$a$a$a$a;

    iget v1, v0, LM7/c$a$a$a$a$a;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LM7/c$a$a$a$a$a;->v:I

    goto :goto_18

    :cond_13
    new-instance v0, LM7/c$a$a$a$a$a;

    invoke-direct {v0, p0, p2}, LM7/c$a$a$a$a$a;-><init>(LM7/c$a$a$a$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LM7/c$a$a$a$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LM7/c$a$a$a$a$a;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3b

    if-ne v2, v3, :cond_33

    iget p0, v0, LM7/c$a$a$a$a$a;->s:I

    iget-object p1, v0, LM7/c$a$a$a$a$a;->r:Ljava/lang/Object;

    check-cast p1, Landroid/widget/LinearLayout;

    iget-object v0, v0, LM7/c$a$a$a$a$a;->q:Ljava/lang/Object;

    check-cast v0, LM7/c;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_60

    :cond_33
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3b
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    sget-object p2, LM7/c;->a:LM7/c;

    iget-object v2, p0, LM7/c$a$a$a$a;->q:Landroid/widget/LinearLayout;

    iget-object v4, p0, LM7/c$a$a$a$a;->r:Landroid/content/Context;

    iget-object v5, p0, LM7/c$a$a$a$a;->s:Lw7/a;

    invoke-static {p2, v4, v5}, LM7/c;->d(LM7/c;Landroid/content/Context;Lw7/a;)Z

    move-result v4

    xor-int/2addr v4, v3

    iget-object p0, p0, LM7/c$a$a$a$a;->s:Lw7/a;

    iput-object p2, v0, LM7/c$a$a$a$a$a;->q:Ljava/lang/Object;

    iput-object v2, v0, LM7/c$a$a$a$a$a;->r:Ljava/lang/Object;

    iput v4, v0, LM7/c$a$a$a$a$a;->s:I

    iput v3, v0, LM7/c$a$a$a$a$a;->v:I

    invoke-virtual {p0, p1, v0}, Lw7/a;->a(Lu7/c;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_5c

    return-object v1

    :cond_5c
    move-object v0, p2

    move-object p1, v2

    move-object p2, p0

    move p0, v4

    :goto_60
    if-eqz p0, :cond_63

    goto :goto_64

    :cond_63
    const/4 v3, 0x0

    :goto_64
    check-cast p2, Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1, v3, p2}, LM7/c;->c(LM7/c;Landroid/widget/LinearLayout;ZLandroid/graphics/drawable/Drawable;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lu7/c;

    invoke-virtual {p0, p1, p2}, LM7/c$a$a$a$a;->a(Lu7/c;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
