.class final LG6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/wallpaper/asset/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/a;->b(Lcom/android/wallpaper/asset/a;ZLm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF8/l;

.field final synthetic b:Lcom/android/wallpaper/asset/a;

.field final synthetic c:Z


# direct methods
.method constructor <init>(LF8/l;Lcom/android/wallpaper/asset/a;Z)V
    .registers 4

    iput-object p1, p0, LG6/a$a;->a:LF8/l;

    iput-object p2, p0, LG6/a$a;->b:Lcom/android/wallpaper/asset/a;

    iput-boolean p3, p0, LG6/a$a;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Point;)V
    .registers 6

    if-nez p1, :cond_d

    iget-object p0, p0, LG6/a$a;->a:LF8/l;

    const/4 p1, 0x0

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_d
    iget-object v0, p0, LG6/a$a;->b:Lcom/android/wallpaper/asset/a;

    iget v1, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    iget-boolean v2, p0, LG6/a$a;->c:Z

    new-instance v3, LG6/a$a$a;

    iget-object p0, p0, LG6/a$a;->a:LF8/l;

    invoke-direct {v3, p0}, LG6/a$a$a;-><init>(LF8/l;)V

    invoke-virtual {v0, v1, p1, v2, v3}, Lcom/android/wallpaper/asset/a;->g(IIZLcom/android/wallpaper/asset/a$d;)V

    return-void
.end method
