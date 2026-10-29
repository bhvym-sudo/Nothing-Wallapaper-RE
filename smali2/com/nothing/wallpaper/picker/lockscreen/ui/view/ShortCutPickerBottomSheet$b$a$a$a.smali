.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    invoke-direct {v0, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;Lm8/e;)V

    iput-object p1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/List;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->s(Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->q:I

    if-nez v0, :cond_39

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->r:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->k0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "shortcutPickerPage"

    if-nez v0, :cond_1d

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1d
    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    invoke-static {v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->j0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;)LC7/a;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->setAlreadyUsedShortcutInfo(LC7/a;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->k0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;

    move-result-object p0

    if-nez p0, :cond_32

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_33

    :cond_32
    move-object v1, p0

    :goto_33
    invoke-virtual {v1, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->b0(Ljava/util/List;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
