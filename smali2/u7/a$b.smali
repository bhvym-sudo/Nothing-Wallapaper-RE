.class final Lu7/a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu7/a;->e(Lu7/c;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lu7/c;

.field final synthetic s:Lu7/a;


# direct methods
.method constructor <init>(Lu7/c;Lu7/a;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lu7/a$b;->r:Lu7/c;

    iput-object p2, p0, Lu7/a$b;->s:Lu7/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, Lu7/a$b;

    iget-object v0, p0, Lu7/a$b;->r:Lu7/c;

    iget-object p0, p0, Lu7/a$b;->s:Lu7/a;

    invoke-direct {p1, v0, p0, p2}, Lu7/a$b;-><init>(Lu7/c;Lu7/a;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lu7/a$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lu7/a$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lu7/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lu7/a$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lu7/a$b;->q:I

    if-nez v0, :cond_97

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu7/a$b;->r:Lu7/c;

    invoke-virtual {p1}, Lu7/c;->c()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_7d

    iget-object p1, p0, Lu7/a$b;->r:Lu7/c;

    invoke-virtual {p1}, Lu7/c;->b()I

    move-result p1

    if-lez p1, :cond_40

    iget-object p1, p0, Lu7/a$b;->s:Lu7/a;

    invoke-static {p1}, Lu7/a;->a(Lu7/a;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    const-string v0, "com.nothing.launcher"

    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object p1

    iget-object v0, p0, Lu7/a$b;->r:Lu7/c;

    invoke-virtual {v0}, Lu7/c;->b()I

    move-result v0

    iget-object p0, p0, Lu7/a$b;->s:Lu7/a;

    invoke-static {p0}, Lu7/a;->a(Lu7/a;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_40
    iget-object p1, p0, Lu7/a$b;->r:Lu7/c;

    invoke-virtual {p1}, Lu7/c;->a()[B

    move-result-object p1

    if-eqz p1, :cond_7c

    new-instance p1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    sget-object v0, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    iget-object v0, p0, Lu7/a$b;->r:Lu7/c;

    invoke-virtual {v0}, Lu7/c;->a()[B

    move-result-object v0

    iget-object v1, p0, Lu7/a$b;->r:Lu7/c;

    invoke-virtual {v1}, Lu7/c;->a()[B

    move-result-object v1

    array-length v1, v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v0, "decodeByteArray(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lu7/a$b;->s:Lu7/a;

    invoke-static {p0}, Lu7/a;->a(Lu7/a;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const-string v0, "getResources(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, p0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    :cond_7c
    return-object v0

    :cond_7d
    iget-object p1, p0, Lu7/a$b;->r:Lu7/c;

    invoke-virtual {p1}, Lu7/c;->b()I

    move-result p1

    if-lez p1, :cond_96

    iget-object p1, p0, Lu7/a$b;->s:Lu7/a;

    invoke-static {p1}, Lu7/a;->a(Lu7/a;)Landroid/content/Context;

    move-result-object p1

    iget-object p0, p0, Lu7/a$b;->r:Lu7/c;

    invoke-virtual {p0}, Lu7/c;->b()I

    move-result p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_96
    return-object v0

    :cond_97
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
