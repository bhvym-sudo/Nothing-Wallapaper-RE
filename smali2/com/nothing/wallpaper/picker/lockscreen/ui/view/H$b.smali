.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:LO2/l;

.field private b:Z

.field private final c:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b$a;


# direct methods
.method public constructor <init>(LO2/l;)V
    .registers 3

    const-string v0, "clockFace"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->a:LO2/l;

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b$a;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->c:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b$a;

    return-void
.end method

.method public static final synthetic a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;)Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->b:Z

    return p0
.end method


# virtual methods
.method public final b()LO2/l;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->a:LO2/l;

    return-object p0
.end method

.method public final c()V
    .registers 2

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->b:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->b:Z

    sget-object v0, LF2/d;->e:LF2/i;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->c:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b$a;

    invoke-virtual {v0, p0}, LF2/i;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d()V
    .registers 2

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->b:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->b:Z

    sget-object p0, LF2/d;->c:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method
