.class final Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Z

.field final synthetic s:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;->s:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;->s:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;

    invoke-direct {v0, p0, p2}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;-><init>(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Lm8/e;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    iput-boolean p0, v0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;->r:Z

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;->s(ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;->q:I

    if-nez v0, :cond_20

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;->r:Z

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;->s:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->O0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;Z)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;->s:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->L0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)LP6/a;

    move-result-object p0

    if-eqz p0, :cond_1d

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    :cond_1d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_20
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(ZLm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$c$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
