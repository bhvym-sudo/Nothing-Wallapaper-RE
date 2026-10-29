.class final LG6/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/wallpaper/asset/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/a$d;->a(Landroid/graphics/Point;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF8/l;


# direct methods
.method constructor <init>(LF8/l;)V
    .registers 2

    iput-object p1, p0, LG6/a$d$a;->a:LF8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;)V
    .registers 2

    iget-object p0, p0, LG6/a$d$a;->a:LF8/l;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
