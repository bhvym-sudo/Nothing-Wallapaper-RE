.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$a$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$a$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->S1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/util/List;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$a$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->t2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$a$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->x2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$i$a$a$a;->a(Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
