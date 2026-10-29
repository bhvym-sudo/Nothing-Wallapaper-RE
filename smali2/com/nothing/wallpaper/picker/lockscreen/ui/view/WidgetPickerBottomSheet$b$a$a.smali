.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    invoke-direct {p1, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-eq v1, v2, :cond_13

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_13
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_40

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->y0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;)LE7/a;

    move-result-object p1

    if-nez p1, :cond_28

    const-string p1, "bottomSheetCallback"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_28
    invoke-interface {p1}, LE7/a;->getLockScreenViewModel()LJ7/i;

    move-result-object p1

    invoke-virtual {p1}, LJ7/i;->F()LI8/E;

    move-result-object p1

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a$a;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    invoke-direct {v1, v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;)V

    iput v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$b$a$a;->q:I

    invoke-interface {p1, v1, p0}, LI8/E;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_40

    return-object v0

    :cond_40
    :goto_40
    new-instance p0, Lh8/f;

    invoke-direct {p0}, Lh8/f;-><init>()V

    throw p0
.end method
