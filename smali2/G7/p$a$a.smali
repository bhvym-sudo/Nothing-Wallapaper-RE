.class final LG7/p$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/p$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Le3/g;

.field final synthetic r:Ly7/s;

.field final synthetic s:Lkotlin/jvm/internal/A;


# direct methods
.method constructor <init>(Le3/g;Ly7/s;Lkotlin/jvm/internal/A;)V
    .registers 4

    iput-object p1, p0, LG7/p$a$a;->q:Le3/g;

    iput-object p2, p0, LG7/p$a$a;->r:Ly7/s;

    iput-object p3, p0, LG7/p$a$a;->s:Lkotlin/jvm/internal/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA7/g;Lm8/e;)Ljava/lang/Object;
    .registers 8

    const/4 p2, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    move v1, p2

    goto :goto_7

    :cond_6
    move v1, v0

    :goto_7
    iget-object v2, p0, LG7/p$a$a;->q:Le3/g;

    iget-object v3, p0, LG7/p$a$a;->s:Lkotlin/jvm/internal/A;

    if-eqz p1, :cond_21

    sget-object v4, LA7/g;->q:LA7/g;

    if-ne p1, v4, :cond_13

    move p1, p2

    goto :goto_14

    :cond_13
    move p1, v0

    :goto_14
    iget-object v4, v2, Le3/g;->F:Lcom/nothing/widget/ui/NtSwitch;

    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    if-eq v4, p1, :cond_21

    iget-object v4, v2, Le3/g;->F:Lcom/nothing/widget/ui/NtSwitch;

    invoke-virtual {v4, p1, v0}, Lcom/nothing/widget/ui/NtSwitch;->g(ZZ)V

    :cond_21
    const/4 p1, 0x4

    const-string v4, "unlockAnimation"

    if-eqz v1, :cond_4c

    iget-boolean v3, v3, Lkotlin/jvm/internal/A;->q:Z

    if-eqz v3, :cond_32

    iget-object p1, v2, Le3/g;->K:Landroid/widget/LinearLayout;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V

    goto :goto_43

    :cond_32
    iget-object v3, v2, Le3/g;->K:Landroid/widget/LinearLayout;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-ne v3, p1, :cond_43

    iget-object p1, v2, Le3/g;->K:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V

    :cond_43
    :goto_43
    iget-object p1, v2, Le3/g;->K:Landroid/widget/LinearLayout;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_58

    :cond_4c
    iget-boolean v3, v3, Lkotlin/jvm/internal/A;->q:Z

    if-eqz v3, :cond_58

    iget-object v2, v2, Le3/g;->K:Landroid/widget/LinearLayout;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_58
    :goto_58
    iget-object p1, p0, LG7/p$a$a;->r:Ly7/s;

    iget-object v2, p0, LG7/p$a$a;->s:Lkotlin/jvm/internal/A;

    iget-boolean v2, v2, Lkotlin/jvm/internal/A;->q:Z

    xor-int/2addr p2, v2

    invoke-interface {p1, v1, p2}, Ly7/s;->q(ZZ)V

    iget-object p0, p0, LG7/p$a$a;->s:Lkotlin/jvm/internal/A;

    iput-boolean v0, p0, Lkotlin/jvm/internal/A;->q:Z

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LA7/g;

    invoke-virtual {p0, p1, p2}, LG7/p$a$a;->a(LA7/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
