.class public final LJ6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, LJ6/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)LJ6/c;
    .registers 12

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LH6/a;->b(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_10

    const p0, 0x7f13022b

    :goto_e
    move v4, p0

    goto :goto_14

    :cond_10
    const p0, 0x7f13022c

    goto :goto_e

    :goto_14
    new-instance v0, LJ6/c;

    const/16 v8, 0x70

    const/4 v9, 0x0

    const-string v1, "bauhaus_color_wallpaper"

    const-string v2, "color_category"

    const v3, 0x7f060023

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, LJ6/c;-><init>(Ljava/lang/String;Ljava/lang/String;IIIIIILkotlin/jvm/internal/h;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;Landroid/util/AttributeSet;)LJ6/c;
    .registers 12

    const-string p0, "categoryId"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "attrs"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "id"

    const/4 v0, 0x0

    invoke-interface {p2, v0, p0}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_47

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_1a

    goto :goto_47

    :cond_1a
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_21

    goto :goto_47

    :cond_21
    const-string p0, "color"

    const/4 v1, 0x0

    invoke-interface {p2, v0, p0, v1}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v4

    const-string p0, "title"

    invoke-interface {p2, v0, p0, v1}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v5

    const-string p0, "subtitle1"

    invoke-interface {p2, v0, p0, v1}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v6

    const-string p0, "subtitle2"

    invoke-interface {p2, v0, p0, v1}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v7

    const-string p0, "actionUrl"

    invoke-interface {p2, v0, p0, v1}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v8

    new-instance v1, LJ6/c;

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, LJ6/c;-><init>(Ljava/lang/String;Ljava/lang/String;IIIII)V

    return-object v1

    :cond_47
    :goto_47
    return-object v0
.end method
