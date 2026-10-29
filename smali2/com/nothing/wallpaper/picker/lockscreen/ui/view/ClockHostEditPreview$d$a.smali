.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

.field final synthetic s:Landroid/view/View;

.field final synthetic t:Lv8/a;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Landroid/view/View;Lv8/a;Lm8/e;)V
    .registers 5

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->s:Landroid/view/View;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->t:Lv8/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->s:Landroid/view/View;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->t:Lv8/a;

    invoke-direct {p1, v0, v1, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Landroid/view/View;Lv8/a;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->q:I

    if-nez v0, :cond_25

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->w(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)Le3/c;

    move-result-object p1

    iget-object p1, p1, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->D(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LO1/b;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->s:Landroid/view/View;

    invoke-virtual {p1, v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->c(LO1/b;Landroid/view/View;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$d$a;->t:Lv8/a;

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_25
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
