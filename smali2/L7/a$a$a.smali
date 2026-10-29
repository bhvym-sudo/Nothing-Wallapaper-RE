.class final LL7/a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL7/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Landroid/widget/ImageView;

.field final synthetic t:Landroid/widget/ImageView;

.field final synthetic u:Landroid/widget/ImageView;


# direct methods
.method constructor <init>(Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lm8/e;)V
    .registers 5

    iput-object p1, p0, LL7/a$a$a;->s:Landroid/widget/ImageView;

    iput-object p2, p0, LL7/a$a$a;->t:Landroid/widget/ImageView;

    iput-object p3, p0, LL7/a$a$a;->u:Landroid/widget/ImageView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 6

    new-instance v0, LL7/a$a$a;

    iget-object v1, p0, LL7/a$a$a;->s:Landroid/widget/ImageView;

    iget-object v2, p0, LL7/a$a$a;->t:Landroid/widget/ImageView;

    iget-object p0, p0, LL7/a$a$a;->u:Landroid/widget/ImageView;

    invoke-direct {v0, v1, v2, p0, p2}, LL7/a$a$a;-><init>(Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lm8/e;)V

    iput-object p1, v0, LL7/a$a$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lr2/f;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LL7/a$a$a;->s(Lr2/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LL7/a$a$a;->q:I

    if-nez v0, :cond_76

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LL7/a$a$a;->r:Ljava/lang/Object;

    check-cast p1, Lr2/f;

    iget-object v0, p0, LL7/a$a$a;->s:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, LL7/a$a$a;->t:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, LL7/a$a$a;->u:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    sget-object v0, LL7/a;->a:LL7/a;

    invoke-virtual {p1}, Lr2/f;->b()Lo3/a;

    move-result-object v3

    invoke-virtual {p1}, Lr2/f;->c()Lo3/a;

    move-result-object v4

    invoke-static {v0, v3, v4}, LL7/a;->a(LL7/a;Lo3/a;Lo3/a;)Z

    move-result v0

    if-eqz v0, :cond_48

    iget-object p1, p0, LL7/a$a$a;->s:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, LL7/a$a$a;->t:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, LL7/a$a$a;->u:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p0, p0, LL7/a$a$a;->u:Landroid/widget/ImageView;

    const p1, 0x7f080279

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_73

    :cond_48
    new-instance v0, Lo3/a$b;

    new-instance v1, Lq3/a$c;

    const v2, 0x7f130218

    invoke-direct {v1, v2}, Lq3/a$c;-><init>(I)V

    const v2, 0x7f08027d

    invoke-direct {v0, v2, v1}, Lo3/a$b;-><init>(ILq3/a;)V

    sget-object v1, Ln3/b;->a:Ln3/b;

    iget-object v2, p0, LL7/a$a$a;->s:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lr2/f;->b()Lo3/a;

    move-result-object v3

    if-nez v3, :cond_63

    move-object v3, v0

    :cond_63
    invoke-virtual {v1, v2, v3}, Ln3/b;->a(Landroid/widget/ImageView;Lo3/a;)V

    iget-object p0, p0, LL7/a$a$a;->t:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lr2/f;->c()Lo3/a;

    move-result-object p1

    if-nez p1, :cond_6f

    goto :goto_70

    :cond_6f
    move-object v0, p1

    :goto_70
    invoke-virtual {v1, p0, v0}, Ln3/b;->a(Landroid/widget/ImageView;Lo3/a;)V

    :goto_73
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_76
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Lr2/f;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LL7/a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LL7/a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LL7/a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
