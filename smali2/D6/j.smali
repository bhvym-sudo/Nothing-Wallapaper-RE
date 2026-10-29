.class public final synthetic LD6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Landroid/graphics/Rect;

.field public final synthetic r:LC6/a;

.field public final synthetic s:LC6/d;

.field public final synthetic t:LD6/k;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Rect;LC6/a;LC6/d;LD6/k;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/j;->q:Landroid/graphics/Rect;

    iput-object p2, p0, LD6/j;->r:LC6/a;

    iput-object p3, p0, LD6/j;->s:LC6/d;

    iput-object p4, p0, LD6/j;->t:LD6/k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, LD6/j;->q:Landroid/graphics/Rect;

    iget-object v1, p0, LD6/j;->r:LC6/a;

    iget-object v2, p0, LD6/j;->s:LC6/d;

    iget-object p0, p0, LD6/j;->t:LD6/k;

    invoke-static {v0, v1, v2, p0}, LD6/k;->a(Landroid/graphics/Rect;LC6/a;LC6/d;LD6/k;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
