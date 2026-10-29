.class public final LY5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LY5/b;

.field private static final b:[I

.field private static final c:[I

.field private static final d:[I

.field private static final e:[I

.field private static final f:[I

.field private static final g:[I

.field private static final h:[I

.field private static final i:[I

.field private static final j:[I

.field private static final k:[I

.field private static final l:[I

.field private static final m:[I

.field private static final n:[I

.field private static final o:[I

.field private static final p:[I

.field private static final q:[I


# direct methods
.method static constructor <clinit>()V
    .registers 5

    new-instance v0, LY5/b;

    invoke-direct {v0}, LY5/b;-><init>()V

    sput-object v0, LY5/b;->a:LY5/b;

    const/4 v0, 0x1

    const/4 v1, 0x2

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, LY5/b;->b:[I

    const/4 v0, 0x7

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LY5/b;->c:[I

    const/4 v0, 0x5

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LY5/b;->d:[I

    const/4 v0, 0x4

    const/4 v1, 0x6

    const/4 v2, 0x3

    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, LY5/b;->e:[I

    const/16 v0, 0x8

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LY5/b;->f:[I

    const/16 v0, 0xb

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LY5/b;->g:[I

    new-array v0, v1, [I

    fill-array-data v0, :array_96

    sput-object v0, LY5/b;->h:[I

    const/16 v0, 0x29

    const/16 v1, 0x2a

    const/16 v2, 0xf

    const/16 v3, 0x10

    const/16 v4, 0x11

    filled-new-array {v2, v3, v4, v0, v1}, [I

    move-result-object v0

    sput-object v0, LY5/b;->i:[I

    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_a6

    sput-object v0, LY5/b;->j:[I

    const/16 v0, 0x19

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LY5/b;->k:[I

    const/16 v0, 0x20

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LY5/b;->l:[I

    const/16 v0, 0x21

    const/16 v1, 0x22

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, LY5/b;->m:[I

    const/16 v0, 0x24

    const/16 v1, 0x26

    const/16 v2, 0x23

    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, LY5/b;->n:[I

    const/16 v0, 0x25

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LY5/b;->o:[I

    const/16 v0, 0x1e

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LY5/b;->p:[I

    const/16 v0, 0x1f

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, LY5/b;->q:[I

    return-void

    nop

    :array_96
    .array-data 4
        0xc
        0xd
        0xe
        0x12
        0x27
        0x28
    .end array-data

    :array_a6
    .array-data 4
        0x13
        0x14
        0x15
        0x16
        0x17
        0x18
        0x1a
        0x1d
        0x2b
        0x2c
    .end array-data
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)I
    .registers 2

    sget-object p0, LY5/b;->b:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_b

    sget p0, LW5/a;->n:I

    return p0

    :cond_b
    sget-object p0, LY5/b;->c:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_16

    sget p0, LW5/a;->b:I

    return p0

    :cond_16
    sget-object p0, LY5/b;->d:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_21

    sget p0, LW5/a;->g:I

    return p0

    :cond_21
    sget-object p0, LY5/b;->e:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_2c

    sget p0, LW5/a;->j:I

    return p0

    :cond_2c
    sget-object p0, LY5/b;->f:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_37

    sget p0, LW5/a;->i:I

    return p0

    :cond_37
    sget-object p0, LY5/b;->g:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_42

    sget p0, LW5/a;->e:I

    return p0

    :cond_42
    sget-object p0, LY5/b;->h:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_4d

    sget p0, LW5/a;->k:I

    return p0

    :cond_4d
    sget-object p0, LY5/b;->i:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_58

    sget p0, LW5/a;->o:I

    return p0

    :cond_58
    sget-object p0, LY5/b;->j:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_63

    sget p0, LW5/a;->m:I

    return p0

    :cond_63
    sget-object p0, LY5/b;->k:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_6e

    sget p0, LW5/a;->l:I

    return p0

    :cond_6e
    sget-object p0, LY5/b;->l:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_79

    sget p0, LW5/a;->p:I

    return p0

    :cond_79
    sget-object p0, LY5/b;->m:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_84

    sget p0, LW5/a;->a:I

    return p0

    :cond_84
    sget-object p0, LY5/b;->n:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_8f

    sget p0, LW5/a;->c:I

    return p0

    :cond_8f
    sget-object p0, LY5/b;->o:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_9a

    sget p0, LW5/a;->f:I

    return p0

    :cond_9a
    sget-object p0, LY5/b;->p:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_a5

    sget p0, LW5/a;->h:I

    return p0

    :cond_a5
    sget-object p0, LY5/b;->q:[I

    invoke-static {p0, p1}, Li8/m;->B([II)Z

    move-result p0

    if-eqz p0, :cond_b0

    sget p0, LW5/a;->d:I

    return p0

    :cond_b0
    const/4 p0, 0x0

    return p0
.end method
