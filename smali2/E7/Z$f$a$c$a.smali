.class final LE7/Z$f$a$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE7/Z$f$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:LE7/Z;


# direct methods
.method constructor <init>(LE7/Z;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LE7/Z$f$a$c$a;->s:LE7/Z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LE7/Z$f$a$c$a;

    iget-object p0, p0, LE7/Z$f$a$c$a;->s:LE7/Z;

    invoke-direct {v0, p0, p2}, LE7/Z$f$a$c$a;-><init>(LE7/Z;Lm8/e;)V

    iput-object p1, v0, LE7/Z$f$a$c$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LE7/Z$f$a$c$a;->s(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LE7/Z$f$a$c$a;->q:I

    if-nez v0, :cond_4f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LE7/Z$f$a$c$a;->r:Ljava/lang/Object;

    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    iget-object v0, p0, LE7/Z$f$a$c$a;->s:LE7/Z;

    invoke-virtual {v0}, LE7/Z;->w()Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "collect depthState change:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " oldState:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WallpaperUIHelper"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LE7/Z$f$a$c$a;->s:LE7/Z;

    invoke-virtual {v0}, LE7/Z;->w()Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4c

    iget-object v0, p0, LE7/Z$f$a$c$a;->s:LE7/Z;

    invoke-static {v0}, LE7/Z;->i(LE7/Z;)LE7/c;

    move-result-object v0

    invoke-virtual {v0, p1}, LE7/c;->d(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)V

    iget-object p0, p0, LE7/Z$f$a$c$a;->s:LE7/Z;

    invoke-virtual {p0, p1}, LE7/Z;->M(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)V

    :cond_4c
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_4f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LE7/Z$f$a$c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LE7/Z$f$a$c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LE7/Z$f$a$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
