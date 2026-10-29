.class public final synthetic LC6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:LC6/d;


# direct methods
.method public synthetic constructor <init>(LC6/d;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/c;->q:LC6/d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LC6/c;->q:LC6/d;

    invoke-static {p0}, LC6/d;->a(LC6/d;)Landroid/graphics/Rect;

    move-result-object p0

    return-object p0
.end method
