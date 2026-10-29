.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    return-void
.end method

.method private static final e(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 2

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->i2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0}, LJ7/i;->c1()V

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->U1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object p0

    invoke-virtual {p0}, LJ7/b;->f()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LJ7/n;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->c(LJ7/n;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final c(LJ7/n;Lm8/e;)Ljava/lang/Object;
    .registers 6

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Le3/u;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_f

    const-string p2, "binding"

    invoke-static {p2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p2, v0

    :cond_f
    iget-object p2, p2, Le3/u;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;

    sget-object v1, LJ7/n$d;->q:LJ7/n$d;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p2, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/AccessibilityCellLayout;->f(Z)V

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_55

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->e2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_30

    invoke-virtual {p1}, Lcom/android/launcher3/a;->K()Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_30

    goto :goto_78

    :cond_30
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    sget-object p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->r0:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p2, p1, v1, v2, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;->b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZILjava/lang/Object;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->r2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->X1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->e2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_78

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/a;

    invoke-direct {p2, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    invoke-virtual {p1, p2}, Lcom/android/launcher3/views/e;->setOnCloseBeginListener(Lcom/android/launcher3/views/e$c;)V

    goto :goto_78

    :cond_55
    sget-object p2, LJ7/n$c;->q:LJ7/n$c;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_63

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->v2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    goto :goto_78

    :cond_63
    sget-object p2, LJ7/n$a;->q:LJ7/n$a;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_78

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q2()Z

    move-result p1

    if-nez p1, :cond_78

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$c$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->u2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    :cond_78
    :goto_78
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
